class MatrixAddition{  
	public static void main(String args[]){   
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};
		int c[][]=new int[3][3];
		
		//multiplying and printing multiplication of 2 matrices    
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){      
				c[i][j]=a[i][j]+b[i][j]; 
				System.out.print(c[i][j]+" "); 
			} 
		System.out.println();  
		}    
	}
}  