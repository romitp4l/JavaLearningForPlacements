public class People_Belong_To
{
    class Solution {
        public List<List<Integer>> groupThePeople(int[] groupSizes) {

            HashMap<Integer,ArrayList<Integer>>romit=new HashMap<>();
            List<List<Integer>>ans=new ArrayList<>();


            for(int i=0;i<groupSizes.length;i++){

                if(!romit.containsKey(groupSizes[i])){
                    romit.put(groupSizes[i],new ArrayList<Integer>());
                }
                romit.get(groupSizes[i]).add(i);

            }

            for(int s:romit.keySet()){

                int size=romit.get(s).size()/s;
                for(int i=0;i<size;i++){

                    int start=0;

                    List<Integer>temp=new ArrayList<>();

                    for(;start<s;start++){

                        temp.add(romit.get(s).get(start));

                    }

                    ans.add(temp);

                }


            }

            return ans;

        }
    }


}
