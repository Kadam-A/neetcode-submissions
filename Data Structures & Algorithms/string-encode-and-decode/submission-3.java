class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            
            sb.append(s.length()+"#");
            sb.append(s);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> list = new ArrayList<>();

        int i = 0;
        while (i< str.length()) {
            System.out.println("bi: "+i);
            // int size = Integer.parseInt(String.valueOf(str.charAt(i)));
            char c = str.charAt(i);
            System.out.println("c: "+c);
            int size = str.charAt(i) - '0';
            System.out.println("size1:" + size);
            System.out.println("c: "+str.charAt(i));
            while (str.charAt(++i) != '#') {
                char b = str.charAt(i);
                System.out.println("b: "+b);
                size = (size * 10) + (b - '0');
                System.out.println("inner: "+size);
                // i++;
            }
            System.out.println("size2: "+size);
            i++;
            String s = str.substring(i,i+size);
            System.out.println("s: "+s);
            list.add(s);
            i = size + i;
            System.out.println("ei: "+i);

        }
        return list;
    }
}
