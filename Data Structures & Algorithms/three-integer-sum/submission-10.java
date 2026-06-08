class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> tripletes = new ArrayList<>();
        int pIzquierdo;
        int pDerecho = nums.length - 1;
        int pEstatico = 0;

        if(nums.length == 0){
            return tripletes;
        }

        Arrays.sort(nums);

        while(pEstatico < nums.length -2){

            pIzquierdo = pEstatico + 1;

            while(pIzquierdo < pDerecho ){
                int target = -nums[pEstatico];
                int sum = nums[pIzquierdo] + nums[pDerecho];

                if(sum < target){
                    pIzquierdo++;
                    //pIzquierdo = valorNoRepetido(pIzquierdo,pDerecho, nums, true);
                }
                else if(sum > target){
                    pDerecho--;
                    //pDerecho = valorNoRepetido(pIzquierdo,pDerecho, nums, false);
                }
                else{
                    boolean dup = true;
                    tripletes.add(List.of(nums[pEstatico], nums[pIzquierdo], nums[pDerecho]));
                    pIzquierdo++;
                    pDerecho--;
                    // while(dup){

                    //     if(pIzquierdo > pDerecho) break;

                    //     if(nums[pIzquierdo] == nums[pIzquierdo - 1]){
                    //         pIzquierdo++;
                    //     } else if(nums[pDerecho] == nums[pDerecho + 1]) {
                    //         pDerecho--;
                    //     } else {
                    //         dup = false;
                    //     }
                    // }

                    while(pIzquierdo < pDerecho && nums[pIzquierdo] == nums[pIzquierdo - 1]) pIzquierdo++;
                    while(pIzquierdo < pDerecho && nums[pDerecho] == nums[pDerecho + 1]) pDerecho--;
                }
                
            }

            do{
                if(pEstatico + 1 > nums.length - 1){
                    break;
                }
                pEstatico++;
            } while(nums[pEstatico] == nums[pEstatico - 1]);
            pDerecho = nums.length - 1;

            // pEstatico++;
            // if(nums[pEstatico] == nums[pEstatico - 1]){
            //     continue;
            // }
        }

        return tripletes;
    }

    // private static int valorNoRepetido(int izq, int der, int[] nums, boolean esIzquierda){

    //     int num;
    //     if(esIzquierda){
    //         while(nums[izq] == nums[izq - 1]){
    //             if(izq >= der){
    //                 return izq;
    //             }
    //             izq++;
    //         }
    //         num = izq;
    //     } else{
    //         while(nums[der] == nums[der + 1]){
    //             if(der <= izq){
    //                 return der;
    //             }
    //             der--;
    //         }
    //         num = der;
    //     }
    //     return num;
    // }
}
