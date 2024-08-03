package machine;

public class VendingMachineInventorySystem {
    ItemShelf[] itemSelves;
    public VendingMachineInventorySystem(int size){
        itemSelves = new ItemShelf[size];
        initialEmptyInventory();
    }

    public VendingMachineInventorySystem() {
        itemSelves = new ItemShelf[10];
        for(ItemShelf itemShelf : itemSelves){
            itemShelf = new ItemShelf();
        }
    }

    public void initialEmptyInventory(){
        int start = 101;
        for(int i=0; i<itemSelves.length;i++){
            itemSelves[i] = new ItemShelf(new Item(),start);
            start++;
        }
    }

    public ItemShelf[] getItemSelves() {
        return itemSelves;
    }

    public void setItemSelves(ItemShelf[] itemSelves) {
        this.itemSelves = itemSelves;
    }

    public void addItem(Item item, int code) throws Exception {
        for(ItemShelf itemShelf : itemSelves){
            if(itemShelf.code == code){
                if(itemShelf.isSoldOut){
                    itemShelf.item = item;
                    itemShelf.isSoldOut = false;
                }
                else{
                    throw new Exception("The item is present already");
                }
            }
        }
    }
    public Item getItem(int codeNumber) throws Exception {
        for(ItemShelf itemShelf : itemSelves){
            if(itemShelf.code == codeNumber){
                if(itemShelf.isSoldOut){
                    throw new Exception("The item is not present there");
                }
                else{
                    return itemShelf.item;
                }
            }
        }
        throw new Exception("Invalid Code Number");
    }
    public void updateSoldOutItem(int codeNumber){
        for(ItemShelf itemShelf : itemSelves){
            if(itemShelf.code == codeNumber){
                itemShelf.isSoldOut = true;
            }
        }
    }
}
