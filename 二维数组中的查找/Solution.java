/**
在一个二维数组中（每个一维数组的长度相同）
每一行都按照从左到右递增的顺序排序
每一列都按照从上到下递增的顺序排序
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*/

public class Solution {
	public static void main(String[] args){
		int[][] arr={{1,2,3,4},{5,6,7,8}};
		int ta=6;
		boolean a=Find(ta,arr);
		System.out.println(a);
	}
	
    public static boolean Find(int target, int [][] array) {
           boolean  w=false;
           for(int i=0;i<array[0].length;i++){
              if(w!=true){
                  for(int j=0;j<array.length;j++){
                      if(target==array[i][j]){
                          w=true;
                          break;
                      }
                      else{
                          w=false;
                      }
                  }
              }
           }
        return w;
    }
}