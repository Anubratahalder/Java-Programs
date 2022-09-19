public class kLargestElement {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int k = Integer.parseInt(br.readLine());
        // write your code here
        //create priorityqueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            // fill the queue untill the members in the queue equal or greater than k
            if(i<k){
                pq.add(arr[i]);
            }
            // now i>=k so selection criterion applied
            else{
                if(arr[i]>pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        // print the required numbers
        while(pq.size()>0){
            System.out.println(pq.remove());
            //pq.remove();
        }
    }

}

