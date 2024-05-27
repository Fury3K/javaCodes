package ExerciseGroup2;

public class twoArrays {
    public static void main(String [] args){
        int arr1[] = new int [10];
        int arr2[] = new int [20];

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random()*50);
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\n");
        
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = (int)(Math.random()*50);
            System.out.print(arr2[i] + " ");
        }
        System.out.print("\n");

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                
                if(arr1[i] == arr2[j]){
                    
                    System.out.println("Common elements to both arrays: " + (arr1[i]));
                }
                
            }
        }
    }
}
    
