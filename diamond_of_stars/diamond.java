package diamond_of_stars;

public class diamond {
     public static void main(String[] args) {
        String space= "    ";
        String star="*";
       for(int i = 0;i <= 0;i++){
           
           for(int j = 0;j <= 4;j++){
               System.out.println(space +star);
               star+="**";
               if(space.length() > 0){
                   space=space.substring(1);
               }
           }
       }
        space= " ";
        star="*******";
        for(int i = 0; i<=0;i++){
            for(int j=3;j>=0;j--){
                System.out.println(space +star);
                space+=" ";
            if (star.length() > 2) {
                    star = star.substring(0, star.length() - 2);
            }
            }
        }
}
}
