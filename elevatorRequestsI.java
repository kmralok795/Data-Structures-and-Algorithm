class Main {
    public static int elevatorRequests(int n, int[] requests) {

        int currentFloor = 0;
        int totalTime = 0;

        for (int request : requests) {
            totalTime += Math.abs(currentFloor - request);
            currentFloor = request;
        }

        return totalTime;
    }
    
    public static void main(String ar[]){
        int[] requests={2,1,4,3};
        System.out.println("Total Time taken to complete the requests: "+elevatorRequests(5, requests));
    }
}
