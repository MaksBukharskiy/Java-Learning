public class FriendsStatic {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Maks");
        Friend friend2 = new Friend("Maks");
        Friend friend3 = new Friend("Maks");

        Friend.showFriends();
    }
}

class Friend {
    String name;
    static int numOfFriends;

    public Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numOfFriends + " friends");
    }
}
