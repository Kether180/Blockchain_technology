#Blockchain Technology

##HashCode

## What Is a Hash?

A hash is a mathematical function that converts an input of arbitrary length into an encrypted output of a fixed length. Thus regardless of the original amount of data or file size involved, its unique hash will always be the same size. Moreover, hashes cannot be used to "reverse-engineer" the input from the hashed output, since hash functions are "one-way" (like a meat grinder; you can't put the ground beef back into a steak). Still, if you use such a function on the same data, its hash will be identical, so you can validate that the data is the same (i.e., unaltered) if you already know its hash.

A hash is a function that meets the encrypted demands needed to solve for a blockchain computation.
Hashes are of a fixed length since it makes it nearly impossible to guess the length of the hash if someone was trying to crack the blockchain.
The same data will always produce the same hashed value.
A hash, like a nonce or a solution, is the backbone of the blockchain network.
A hash is developed based on the information present in the block header.

## Hashing and Cryptocurrencies

The backbone of a cryptocurrency is the blockchain, which is a global ledger formed by linking together individual blocks of transaction data. The blockchain only contains validated transactions, which prevents fraudulent transactions and double spending of the currency. The resulting encrypted value is a series of numbers and letters that do not resemble the original data and is called a hash. Cryptocurrency mining involves working with this hash.

Hashing requires processing the data from a block through a mathematical function, which results in an output of a fixed length. Using a fixed-length output increases security since anyone trying to decrypt the hash won’t be able to tell how long or short the input is simply by looking at the length of the output.

Solving the hash starts with the data available in the block header and is essentially solving a complex mathematical problem. Each block header contains a version number, a timestamp, the hash used in the previous block, the hash of the Merkle root, the nonce, and the target hash.

The miner focuses on the nonce, a string of numbers. This number is appended to the hashed contents of the previous block, which is then hashed. If this new hash is less than or equal to the target hash, then it is accepted as the solution, the miner is given the reward, and the block is added to the blockchain.

## Hashes are used in several parts of a blockchain system.

First, each block contains the hash of the block header of the previous block, ensuring that nothing has been tampered with as new blocks are added. Cryptocurrency mining using proof-of-work (PoW), furthermore, utilizes hashing of randomly generated numbers in order to arrive at a specific hashed value containing a series of leading zeroes. This arbitrary function is resource-intensive, making it difficult for a bad actor to overtake the network.
