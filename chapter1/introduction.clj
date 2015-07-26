(def visitors (atom #{}))
(defn hello 
  "Writes hello message to *out*. Calls you by username"
  [username]
  (swap! visitors conj username)
  (str "Hello, " username))
