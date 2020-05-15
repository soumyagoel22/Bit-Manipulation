public class Solution {
    public int singleNumber(final List<Integer> a) {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       int i,n,value,ab;
       n=a.size();
       ab=0;
       value=1;
       for(i=0;i<n;i++)
       {
           if(map.containsKey(a.get(i)))
           {
               map.put(a.get(i),map.get(a.get(i))+1);
           }
           else
           {
               map.put(a.get(i),1);
           }
       }
       for(Map.Entry a1 : map.entrySet())
       {
           if((int)a1.getValue()==value)
           {
               ab = (int)a1.getKey();
               break;
           }
       }
       return ab;
    }
}
