public class FindAndReplaceThe {
    class Solution {
        public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> al = new ArrayList();
            int count1=0;
            HashMap<Character,Integer> romit = new HashMap();
            String res="";
            for(int i=0;i<pattern.length();i++){
                if(romit.containsKey(pattern.charAt(i))){
                    res += ""+romit.get(pattern.charAt(i));
                }else{
                    count1++;
                    romit.put(pattern.charAt(i),count1);
                }
                res += ""+romit.get(pattern.charAt(i));
            }
            for(String str : words){
                String temp1 = "";
                romit.clear();
                count1=0;
                for(int i=0;i<str.length();i++){
                    if(romit.containsKey(str.charAt(i))){
                        temp1 += ""+romit.get(str.charAt(i));
                    }else{
                        count1++;
                        romit.put(str.charAt(i),count1);
                    }
                    temp1 += ""+romit.get(str.charAt(i));
                }
                if(res.equals(temp1)) al.add(str);
                temp1="";
            }
            return al;
        }
    }
}
