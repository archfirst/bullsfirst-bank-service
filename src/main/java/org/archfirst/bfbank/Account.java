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

/**
 * Account
 *
 * @author Naresh Bhatia
 */
public class Account {

    // ----- Constructors -----
    public Account() {
    }

    public Account(int id, String name, String balanceType, double balance) {
        this.id = id;
        this.name = name;
        this.balanceType = balanceType;
        this.balance = balance;
    }

    // ----- Attributes -----
    private int id;
    private String name;
    private String balanceType;
    private double balance;

    // ----- Getters and Setters -----
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getBalanceType() {
        return balanceType;
    }
    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }
    
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}