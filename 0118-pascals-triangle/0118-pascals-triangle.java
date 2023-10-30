class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
        //add the lists to list of list
        for(int i = 0 ; i < numRows ; i++){
            li.add(new ArrayList<>());
        }
        for(int i = 0 ; i < numRows ; i++){

            for(int j = 0 ; j <=i;j++){
                if(j==0 || j== i){
                    li.get(i).add(1);
                }
                else
                {
                    int getLeft = li.get(i-1).get(j-1);

                    int getRight =li.get(i-1).get(j);

                    li.get(i).add(getLeft+getRight);

                }
            }
        }


        return li;
    }
}

// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> pT=new ArrayList<>(numRows);
// 		for(int i=0;i<numRows;i++)
// 			{
// 			pT.add(new ArrayList<Integer>(i+1)); 
// 			}
// 		for(int i=0;i<numRows;i++)
// 			{
// 				for(int j=0;j<=i;j++)
// 					{
// 						if(j==0||j==i)
// 						{
// 							pT.get(i).add(1);
// 						}
// 						else
// 						{
// 							int getAbove =pT.get(i-1).get(j);
// 							int aboveDiagonal=pT.get(i-1).get(j-1);
// 							pT.get(i).add(getAbove+aboveDiagonal);
// 						}
// 					}
// 			}
// 		return pT;
//     }
// }