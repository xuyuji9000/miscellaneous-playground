class OldSystem:
    def legacy_operation(self):
        return "Legacy operation"

class Adapter:
    def __init__(self, old_system):
        self.old_system = old_system
    
    def new_operation(self):
        return f"Adapter: {self.old_system.legacy_operation()}"

def client_code(adapter):
    result = adapter.new_operation()
    print(result)

if __name__ == "__main__":
    old_system = OldSystem()
    adapter = Adapter(old_system)
    client_code(adapter)