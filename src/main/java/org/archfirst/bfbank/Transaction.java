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
 * Transaction
 *
 * @author Naresh Bhatia
 */
public class Transaction {

    // ----- Constructors -----
    public Transaction() {
    }
    
    public Transaction(
            int id,
            int accountId,
            String date,
            String description,
            String type,
            String status,
            double amount,
            double balance) {
        this.id = id;
        this.accountId = accountId;
        this.date = date;
        this.description = description;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.balance = balance;
    }

    // ----- Attributes -----
    private int id;
    private int accountId;
    private String date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private double balance;

    // ----- Getters and Setters -----
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

    public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
