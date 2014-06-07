package com.shufudesing.drmb;

import java.sql.Struct;

/**
 * Created by Sam on 5/9/2014.
 */
public class DrUTILS {

    //Circle constants
    public static final int CIRCLE_SIZE = 400;
    public static final int RING_SIZE = 20;
    public static final float INFO_TEXT_SIZE = 45f;
    public static final float MONEY_TEXT_SIZE = 75f;
    public static final float CAT_BTN_TEXT_SIZE = 50f;
    public static final int LINE_LENGTH = 30;

    public static final int SAVINGS_BAR_SIZE = 300;

    public static final String MONTH = "MONTH";
    public static final String WEEK = "WEEK";
    public static final String DAY = "DAY";

    //App Color constants
    public static final int GREEN = 0xff7f9a65;
    public static final int RED = 0xffcd5c5c;
    public static final int BLUE = 0xffc0d9d9;
    public static final int GRAY = 0xffe5e5e5;

    //Category bar constants
    public static final int NUM_CATS = 5;
    public static final int CAT_MAX_HEIGHT = 200;
    public static final String[] CAT_NAMES = {"FUN", "FOOD", "BILLS", "HOME", "TRANSIT"};
    public static final String[] CAT_DB_NAMES = {"fun", "food", "bills", "rent", "trans"};
    public static final String[] DRAWER_ITEMS = {"OVERVIEW", "SAVED LOCATIONS", "HISTORY", "OUTLOOK", "TIPS", "SETTINGS"};

    public static final int CAT_BTN_HEIGHT = 100;

    //Positions for drawer items
    public static final int OVERVIEW = 0;
    public static final int SAVED_LOCATIONS = 1;
    public static final int HISTORY_POS = 2;
    public static final int OUTLOOK = 2;
    public static final int TIPS = 3;
    public static final int SETTINGS = 4;

    //JSON
    public static final String JSON_BUDGET = "budget";
    public static final String JSON_CALL_STACK = "callStack";
    public static final String JSON_METHOD_NAME = "methodName";
    public static final String JSON_METHOD_ARGS= "methodArgs";
    public static final String JSON_FIELDS = "fields";
    public static final String JSON_DOC_ID = "docid";
    public static final String JSON_EXPENSES = "expenses";

}
