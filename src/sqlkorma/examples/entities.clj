(defentity users
  (pk :my_pk) ;; By default "id"
  (table :k_users) ;; By default the name of the symbol
  (entity-fields :first :last) ;; Default fields for selects

  ;; mutations
  (prepare ..) ;; apply a function before storing in the db
  (transform ..) ;; apply a function to all select results

  ;;Relationships
  (has-one email) 
      ;; assumes users.id = email.users_id
  (has-many address) 
      ;; assumes users.id = address.users_id
      ;; but gets the results in a second query
      ;; for each element
  (belongs-to account))
      ;; assumes users.account_id = account.id

