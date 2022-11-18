import java.util.*;
public class TheWhitePages {
    static final int delete = 1;
    static final int search = 2;
    static void startMessage() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("전화번호 관리 프로그램을 시작합니다. 파일을 저장하지 않습니다.");
        System.out.println("--------------------------------------------------------------");
    }
    static int chooseMenu(Scanner s) {
        System.out.print("삽입 : 0, 삭제 : 1, 찾기 : 2, 전체보기 : 3, 종료 : 4 >> ");
        int choose = 0;
        try {choose = s.nextInt();}
        catch(InputMismatchException e) {System.out.println("숫자만 입력하세요."); exit(0);}
        return choose;
    }
    static Phone insertPages(HashMap <String, Phone> pages, Scanner s) {
        Phone phone = new Phone();
        System.out.print("이름 >> ");
        String name = s.next();
        if(pages.containsKey(name))
            return phone;
        phone.setName(name);
        s.nextLine();
        System.out.print("주소 >> ");
        phone.setAddress(s.nextLine());
        System.out.print("전화번호 >> ");
        phone.setPhoneNumber(s.next());
        return phone;
    }
    static void deleteSearchPages(HashMap <String, Phone> pages, Scanner s, int command) {
        System.out.print("이름 >> ");
        String name = s.next();
        if(pages.containsKey(name)) {
            if(command == search) {
                Phone phone = (Phone)pages.get(name);
                phone.printAll();
            }
            else if(command == delete) {
                pages.remove(name);
                System.out.println("삭제했습니다.");
            }
        }
        else
            System.out.println("일치하는 데이터가 없습니다.");
    }
    static void printAll(HashMap <String, Phone> pages) {
        final Enumeration<String> e = Collections.enumeration(pages.keySet());
        while(e.hasMoreElements()) {
            String key = (String)e.nextElement();
            Phone phone = (Phone)pages.get(key);
            System.out.println(key + " " + phone.getAddress() + " " + phone.getPhoneNumber());
        }
    }
    static void exit(int status) {
        System.out.println("프로그램을 종료합니다...");
        System.exit(status);
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        HashMap <String, Phone> pages = new HashMap <String, Phone>();

        startMessage(); // 프로그램 시작 메시지
        while(true) {
            int choose = chooseMenu(s);
            switch(choose) { // 메뉴 선택
                case 0 :
                    Phone phone = insertPages(pages, s);
                    if(pages.containsKey(phone.getName())) {
                        System.out.println("같은 이름이 있어서 입력을 할 수 없습니다.");
                        break;
                    }
                    pages.put(phone.getName(), phone);
                    break;
                case 1 : deleteSearchPages(pages, s, delete); break;
                case 2 : deleteSearchPages(pages, s, search); break;
                case 3 : printAll(pages); break;
                case 4 : exit(0); break;
            }
        }
    }
}
