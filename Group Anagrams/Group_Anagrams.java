import java.util.*;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();

        for(int i =0; i< strs.length;i++)
        {
           char[] temp = strs[i].toCharArray();
           Arrays.sort(temp);
           String temp2 = String.valueOf(temp);
            if(hm.containsKey(temp2))
            {
                hm.get(temp2).add(strs[i]);
            }
            if(hm.containsKey(temp2)==false)
            {
                hm.put(temp2, new ArrayList<String>());
                hm.get(temp2).add(strs[i]);
            }
        }
        //System.out.println(hm);
        List<List<String>> result = new LinkedList<>();
        for (Map.Entry<String,ArrayList<String>> entry : hm.entrySet()) {
            List<String> list = new LinkedList<String>();
            for(int i =0; i<entry.getValue().size();i++)
            {
                list.add(entry.getValue().get(i));
            }
            result.add(list);

        }


        return result;
    }

    public static void main(String[] args)
    {
        String str[] = {"eat","tea","tan","ate","nat","bat"};
        Group_Anagrams obj = new Group_Anagrams();
        List<List<String>> result = obj.groupAnagrams(str);
        System.out.println(result);
    }
}
