class Solution {
    public int calPoints(String[] operations) {
       ArrayList<Integer> record = new ArrayList<>();
       int sum = 0;
       for (int i = 0; i < operations.length; i++){
            if(operations[i].equals("+") && (operations[i-2] != null)){
                int i1 = record.get(record.size() - 1);
                int i2 = record.get(record.size() - 2);
                int i3 = i1+i2;
                record.add(i3);
                sum += i3;
                continue;
                }
            if(operations[i].toUpperCase().equals("D") && (operations[i-1] != null)){
                //int i1 = Integer.parseInt(operations[i-1]) * 2;
                int i1 = record.get(record.size() - 1) * 2;
                record.add(i1);
                sum += i1;
                continue;
                }
            if(operations[i].toUpperCase().equals("C")){
                int removed = record.remove(record.size() - 1);
                sum -= removed;
                continue;
                }
            int addNum = Integer.parseInt(operations[i]);
            record.add(addNum);
            sum += addNum;
       }
       return sum;
    }
}