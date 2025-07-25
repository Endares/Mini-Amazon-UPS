1. Direct SQL Operations in Java
The Java backend (App.java, UpsServer.java, etc.) uses direct SQL queries for database operations, including deletion and insertion.
Risk: If not carefully handled, this can lead to data loss, SQL injection, or inconsistent states.
Suggestion: Always validate input and use ORM best practices.
2. No User Authentication for Sensitive Operations
The push notification feature does not check if the user is authorized to push the status of a given package.
Risk: Any user can push the status of any package to the configured WeChat, leading to information leakage or spam.
Suggestion: Add user authentication and permission checks before allowing status push.
3. Potential Data Race in Multi-threaded Java Server
The Java server (UpsServer.java, AmazonListener.java, AmazonSender.java) uses multiple threads and database sessions.
Risk: Without proper transaction isolation and session management, this can cause data races or deadlocks.
Suggestion: Ensure all database operations are thread-safe and transactions are properly managed.
4. No Input Validation for Package ID
The push_wechat endpoint does not validate the format or existence of the package ID before querying the database.
Risk: This may lead to exceptions, error spam, or even DoS if abused.
Suggestion: Add input validation and rate limiting.