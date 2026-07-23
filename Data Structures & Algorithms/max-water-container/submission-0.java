class Solution {
    public int maxArea(int[] heights) {
        int pIzquierdo = 0;
        int pDerecho = heights.length - 1;
        int areaMax = 0; 

        while (pIzquierdo < pDerecho){
            int areaActual = Math.min(heights[pIzquierdo], heights[pDerecho]) * (pDerecho - pIzquierdo);

            areaMax = Math.max(areaMax, areaActual);

            if(heights[pIzquierdo] > heights[pDerecho]){
                pDerecho--;
            } else{ pIzquierdo++; }
        }

        return areaMax;
    }
}
