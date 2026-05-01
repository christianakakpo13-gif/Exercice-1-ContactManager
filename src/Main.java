class Main {
    public static void main(String[] args) {
        ContactsManager mgr = new ContactsManager();

        // Créer et ajouter 5 contacts
        Contact c1 = new Contact();
        c1.name = "Alice";
        c1.phoneNumber = "0701234567";
        mgr.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "Bob";
        c2.phoneNumber = "0712345678";
        mgr.addContact(c2);

        Contact c3 = new Contact();
        c3.name = "Chloé";
        c3.phoneNumber = "0723456789";
        mgr.addContact(c3);

        Contact c4 = new Contact();
        c4.name = "David";
        c4.phoneNumber = "0734567890";
        mgr.addContact(c4);

        Contact c5 = new Contact();
        c5.name = "Emma";
        c5.phoneNumber = "0745678901";
        mgr.addContact(c5);

        // Rechercher et afficher un contact
        Contact found = mgr.searchContact("Chloé");
        if (found != null) {
            System.out.println("Trouvé : " + found.phoneNumber);
        } else {
            System.out.println("Contact introuvable.");
        }
    }
}