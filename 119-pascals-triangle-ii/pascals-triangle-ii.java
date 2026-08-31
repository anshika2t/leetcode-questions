class Solution {
    public List<Integer> getRow(int rowIndex) {
      ArrayList<Integer> old = new ArrayList<>();
      old.add(1);
      for(int i=0;i<rowIndex;i++){
            ArrayList<Integer> newRow = new ArrayList<>();
        newRow.add(1);
       for (int j = 1; j < old.size(); j++){
              newRow.add(old.get(j - 1) + old.get(j));
        }
         newRow.add(1);
            old = newRow;

      }
      return old;
  
    }
}