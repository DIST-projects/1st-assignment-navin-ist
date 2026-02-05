# rpc_client.py
import xmlrpc.client

# Replace with your CLOUD VM Public IP
server = xmlrpc.client.ServerProxy("http://20.198.251.98:8000")

print("Addition:", server.add(10, 5))
print("Subtraction:", server.subtract(10, 5))
print("Multiplication:", server.multiply(10, 5))
print("Division:", server.divide(10, 5))
print("Division by Zero:", server.divide(10, 0))
