/**
 * Copyright 2013 Archfirst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.archfirst.bfbank;

import java.util.ArrayList;
import java.util.List;

/**
 * AccountRepository
 *
 * @author Naresh Bhatia
 */
public class Repository {
    
    private static ArrayList<Account> accounts = new ArrayList<Account>();
    private static ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    
    static {
    	// Populate accounts
        accounts.add(new Account(1, "Checking Paul", "Available Balance", 10200.34));
        accounts.add(new Account(2, "Checking Linda", "Available Balance", 2067.22));
        accounts.add(new Account(3, "Bulls Rewards Visa", "Current Balance", 6197.41));
        
    	// Populate transactions
        transactions.add(new Transaction( 1, 1, "03/22/2013", "ACH Credit Acme Corp",            "Credit",     "Pending",  1000.00, 11281.82));
        transactions.add(new Transaction( 2, 1, "03/22/2013", "John's Landscaping Bill Payment", "Bill Pay",   "Cleared",   -40.00, 10281.82));
        transactions.add(new Transaction( 3, 1, "03/20/2013", "ACH Credit Acme Corp",            "Deposit",    "Cleared",  3000.20, 10321.82));
        transactions.add(new Transaction( 4, 1, "03/18/2013", "ATM Withdrawal",                  "Withdrawal", "Cleared",   -40.00,  7321.62));
        transactions.add(new Transaction( 5, 1, "03/12/2013", "Check 837",                       "Check",      "Cleared", -2000.00,  7361.62));
        transactions.add(new Transaction( 6, 1, "03/10/2013", "E*TRADE Bank",                    "Transfer",   "Cleared", -5000.00,  9361.62));
        transactions.add(new Transaction( 7, 1, "03/05/2013", "Cash withdrawal - 10 Smith St.",  "Debit",      "Cleared",  -200.00, 14361.62));
        transactions.add(new Transaction( 8, 1, "03/01/2013", "Nordstrom Visa Bill Payment",     "Bill Pay",   "Cleared",  -345.25, 14561.62));
        transactions.add(new Transaction( 9, 1, "02/28/2013", "Chase Card Bill Payment",         "Bill Pay",   "Cleared",  -102.22, 14906.87));
        transactions.add(new Transaction(10, 1, "02/24/2013", "Banana Republic Bill Payment",    "Bill Pay",   "Cleared",  -384.29, 15009.09));
        transactions.add(new Transaction(11, 1, "02/22/2013", "ACH Credit Acme Corp",            "Credit",     "Cleared",  1000.00, 15393.38));
        transactions.add(new Transaction(12, 1, "02/20/2013", "Nation Grid Payment",             "Debit",      "Cleared",  -212.79, 14393.38));
        transactions.add(new Transaction(13, 1, "02/17/2013", "Lincoln Township",                "Bill Pay",   "Cleared", -1022.54, 14606.17));
        transactions.add(new Transaction(14, 1, "02/15/2013", "Check 836",                       "Check",      "Cleared",  -200.00, 15628.71));
        transactions.add(new Transaction(15, 1, "02/12/2013", "Check 835",                       "Check",      "Cleared",  -194.22, 15828.71));
        transactions.add(new Transaction(16, 1, "02/10/2013", "Check 834",                       "Check",      "Cleared",  -897.07, 16022.93));
        transactions.add(new Transaction(17, 1, "02/05/2013", "ATM Withdrawal",                  "Withdrawal", "Cleared",  -200.00, 16920.00));
        transactions.add(new Transaction(18, 1, "02/02/2013", "ACH Credit Acme Corp",            "Credit",     "Pending",  1000.00, 17120.00));
        transactions.add(new Transaction(19, 1, "01/31/2013", "John's Landscaping Bill Payment", "Bill Pay",   "Cleared",   -40.00, 16120.00));
        transactions.add(new Transaction(20, 1, "01/27/2013", "Check 833",                       "Check",      "Cleared",  -800.00, 16160.00));
        transactions.add(new Transaction(21, 1, "01/25/2013", "ACH Credit Acme Corp",            "Credit",     "Cleared",  1000.00, 16960.00));
        transactions.add(new Transaction(22, 1, "01/22/2013", "ATM Withdrawal",                  "Withdrawal", "Cleared",  -200.00, 15960.00));
        transactions.add(new Transaction(23, 1, "01/20/2013", "ACH Credit Acme Corp",            "Credit",     "Pending",  3000.00, 16160.00));
        transactions.add(new Transaction(24, 1, "01/16/2013", "ATM Withdrawal",                  "Withdrawal", "Cleared",  -200.00, 13160.00));
        transactions.add(new Transaction(25, 1, "01/14/2013", "Check 832",                       "Check",      "Cleared",  -200.00, 13360.00));
        transactions.add(new Transaction(26, 1, "01/12/2013", "ACH Credit Acme Corp",            "Credit",     "Pending",  2000.00, 13560.00));
        transactions.add(new Transaction(27, 1, "01/10/2013", "John's Landscaping Bill Payment", "Bill Pay",   "Cleared",   -40.00, 11560.00));
        transactions.add(new Transaction(28, 1, "01/07/2013", "Check 831",                       "Check",      "Cleared",  -400.00, 11600.00));
        transactions.add(new Transaction(29, 1, "01/05/2013", "ACH Credit Acme Corp",            "Credit",     "Pending",  1000.00, 12000.00));
        transactions.add(new Transaction(30, 1, "01/01/2013", "Check 830",                       "Check",      "Cleared",  -300.00, 11000.00));

        transactions.add(new Transaction(40, 2, "01/27/2013", "Check 125",                       "Check",      "Cleared",  -800.00, 10000.00));
        transactions.add(new Transaction(41, 2, "01/25/2013", "ACH Credit Acme Corp",            "Credit",     "Cleared",  1000.00, 10800.00));
        transactions.add(new Transaction(42, 2, "01/22/2013", "ATM Withdrawal",                  "Withdrawal", "Cleared",  -200.00,  9800.00));
        transactions.add(new Transaction(43, 2, "01/20/2013", "ACH Credit Acme Corp",            "Credit",     "Pending",  3000.00, 10000.00));
    
        transactions.add(new Transaction(50, 3, "02/24/2013", "Banana Republic Bill Payment",    "Bill Pay",   "Cleared",  -300.00,  2500.00));
        transactions.add(new Transaction(51, 3, "02/22/2013", "ACH Credit Acme Corp",            "Credit",     "Cleared",  1000.00,  2800.00));
        transactions.add(new Transaction(52, 3, "02/20/2013", "Nation Grid Payment",             "Debit",      "Cleared",  -200.00,  1800.00));
        transactions.add(new Transaction(53, 3, "02/17/2013", "Lincoln Township",                "Bill Pay",   "Cleared", -1022.54,  2000.00));
    }
    
    /**
     * Returns all accounts
     */
    public static List<Account> findAccounts() {
        return new ArrayList<Account>(accounts);
    }

    /**
     * Returns transactions for the specified account
     */
    public static List<Transaction> findTransactions(int accountId) {
        List<Transaction> transactionList = new ArrayList<Transaction>();
        for (Transaction transaction: transactions) {
            if (transaction.getAccountId() == accountId) {
            	transactionList.add(transaction);
            }
        }
        
        return transactionList;
    }
}