public enum TrafficLight {
    RED(30), AMBER(10), GREEN(30);
    int sec;
    TrafficLight(int sec){this.sec = sec;}
    int getSec(){
        return sec;
    }
}
