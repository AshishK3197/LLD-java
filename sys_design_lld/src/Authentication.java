hash = hash_function(password)

entered_hash = hash_function(entered_password)
if (entered_hash == stored_hash) {
	VALID_PASSWORD;
} else {
	INVALID_PASSWORD;
}





USER COLUMNS: - 

UserId  		Name			hashed_password (using SHA256 (256 bit - 32byte), SHA512 etc.)
1				Ashish			xaksncadvcahlbcavnahbvahd  