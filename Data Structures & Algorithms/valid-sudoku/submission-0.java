class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Character>> cols = new HashMap<>();
        Map<Integer, HashSet<Character>> rows = new HashMap<>();
        Map<List<Integer>, HashSet<Character>> squares = new HashMap<>();

        for(int i = 0; i < 9; i++){
            rows.put(i, new HashSet<>());
            for(int j = 0; j < 9; j++){
                cols.putIfAbsent(j, new HashSet<>());
                squares.putIfAbsent(List.of(i/3, j/3), new HashSet<>());

                //Se omiten los espacios vacios
                if(board[i][j] == '.'){
                    continue;
                }

                //Checa repetidos
                if(!rows.get(i).add(board[i][j]) ||
                !cols.get(j).add(board[i][j]) ||
                !squares.get(List.of(i/3, j/3)).add(board[i][j])){
                return false;
                }
            }
        }

        return true;

    }
}
