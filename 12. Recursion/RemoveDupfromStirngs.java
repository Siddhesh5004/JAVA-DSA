

public class RemoveDupfromStirngs {

    public static void rmvDuplicates(int index , String str , StringBuilder newstr,boolean map[] ) {
        //base case
        if(index ==str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currChar = str.charAt(index);
        if(map[currChar - 'a']==true){
            //duplicate yes

            rmvDuplicates(index+1, str, newstr, map);
        }else{
            map[currChar-'a'] =true;
            rmvDuplicates(index+1, str, newstr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        
        String str = "siddhesh";
        rmvDuplicates(0, str, new StringBuilder(""), new boolean[26]);
    }    
}
