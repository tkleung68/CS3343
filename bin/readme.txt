The following commands are for the program.
1. Register Company Account: 'register company userid password companyname'
regCompany cityu 1234 cityu 

2. Register Customer Account: 'register customer userid password name dateOfBirth firstDeposit'
regCustomer tkleung 1234 Sam 2019/11/28 500

3. Login Account: 'login username password'
login tkleung 1234	

------------------------          For Customer Login Function        --------------------
1. Show all shop details: 
showAllShop

2. Show products of a specific shop details: 'show userid'
showShopProduct cityu

3. Add products of a shop to the shopping trolley: 'addToTrolley userId(shopId) pid quantity'
addToTrolley cityu 10200 10

4. Show shopping trolley item:
showTrolley

5. Remove shopping trolley item: 'removeFromTrolley pid quantity'
removeFromTrolley 10200 2

6. Deposit: 'deposit amount'
deposit 500

7. Checkout:
checkout

------------------------          For Company Login Function        --------------------
1. Add product: 'createProduct userid productName price stock'
createProduct cityu apple 5 500

2. Show stock status: 
showStatus

3. Remove product: 'removeProduct productID'
remove ae001

4. fill product: 'fill productID quantity'
fill ae001 300

5. show sells record:
showSales

6. Edit Description: "editDescription#Description"
editDescription#This is new shop.

7. checkout:
checkout