# bullsfirst-bank-service

A simple RESTful service exposing bank accounts and transactions. See examples below.

## Get Accounts
    GET http://archfirst.org/bullsfirst-bank/rest/accounts
    
    [
        {
            "id": 1,
            "name": "Checking Paul",
            "balanceType": "Available Balance",
            "balance": 10200.34
        },
        {
            "id": 2,
            "name": "Checking Linda",
            "balanceType": "Available Balance",
            "balance": 2067.22
        },
        {
            "id": 3,
            "name": "Bulls Rewards Visa",
            "balanceType": "Current Balance",
            "balance": 6197.41
        }
    ]
    
## Get Transactions
    GET http://archfirst.org/bullsfirst-bank/rest/transactions?accountId=2
    
    [
        {
            "id": 40,
            "accountId": 2,
            "date": "01/27/2013",
            "description": "Check 125",
            "type": "Check",
            "status": "Cleared",
            "amount": -800,
            "balance": 10000
        },
        {
            "id": 41,
            "accountId": 2,
            "date": "01/25/2013",
            "description": "ACH Credit Acme Corp",
            "type": "Credit",
            "status": "Cleared",
            "amount": 1000,
            "balance": 10800
        },
        ...
    ]
