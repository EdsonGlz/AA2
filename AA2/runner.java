public class runner{
    public static void main(String[] args)
    {
        Node root = new Node();
        root.keys.add(7);
        root.keys.add(16);

        root.isLeaf = true;
        root.parent = null;

        Node H1 = new Node();
        H1.keys.add(1);
        H1.keys.add(2);
        H1.keys.add(5);
        H1.keys.add(6);

        H1.isLeaf = true;
        H1.parent = root;

        Node H2 = new Node();
        H2.keys.add(9);
        H2.keys.add(12);
        H2.keys.add(13);
        H2.keys.add(14);

        H2.isLeaf = false;
        H2.parent = root;

        Node H3 = new Node();
        H3.keys.add(18);
        H3.keys.add(21);
        H3.keys.add(22);
        H3.keys.add(23);

        H3.isLeaf = true;
        H3.parent = root;

        /*Node H4 = new Node();
        H4.keys.add(-1);
        H4.keys.add(-2);

        H4.isLeaf = true;
        H4.parent = root;

        H1.children.add(H4);*/
        root.children.add(H1);
        root.children.add(H2);
        root.children.add(H3);

        ArbolB tree =  new ArbolB(root);
        tree.print(tree.root);
        System.out.println(tree.allNodesInOrder());

        System.out.println(tree.eje2());

        System.out.println(tree.eje3());

        System.out.println(tree.eje4());

        System.out.println(tree.eje5());

        System.out.println(tree.eje6());
        
        System.out.println(tree.eje7());

        
    }
}


