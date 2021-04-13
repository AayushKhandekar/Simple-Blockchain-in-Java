import java.util.ArrayList;

public class BlockChain {
    public static void main(String[] args) {

        ArrayList<Block> blockChain = new ArrayList<Block>();

        String[] initialValues = { "I have 500$" };
        Block firstBlock = new Block(initialValues , 0);
        blockChain.add(firstBlock);
        System.out.println(firstBlock.toString());
        // System.out.println(blockChain.toString());

        String[] nonInitialValues = { "You have 1000$" };
        Block secondBlock = new Block(nonInitialValues , firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println(secondBlock.toString());
        System.out.println(blockChain.toString());
    }

}