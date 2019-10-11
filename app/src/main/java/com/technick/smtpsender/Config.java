package com.technick.smtpsender;

import android.provider.ContactsContract;

public class Config {

        public static String EMAIL ="";
        public static String PASSWORD ="";

        public static String EMAIL1 ="MessageCannon@gmail.com";
        public static String PASSWORD1 ="automate!";

        public static String EMAIL2 ="MessageCannon@gmail.com";
        public static String PASSWORD2 ="automate!";

        public static String EMAIL3 ="MessageCannon@gmail.com";
        public static String PASSWORD3 ="automate!";

        public static String EMAIL4 ="MessageCannon@gmail.com";
        public static String PASSWORD4 ="automate!";

        public void setEmail(int slot, String email, String password)
        {
            switch (slot)
            {
                case 1: EMAIL = email; PASSWORD = password; break;
                case 2: EMAIL1 = email; PASSWORD1 = password; break;
                case 3: EMAIL2 = email; PASSWORD2 = password; break;
                case 4: EMAIL3 = email; PASSWORD3 = password; break;
                case 5: EMAIL4 = email; PASSWORD4 = password; break;
            }

        }

        public String getEmails()
        {
            return EMAIL + "" + EMAIL1 + EMAIL2 + EMAIL3 + EMAIL4;

        }
    }
