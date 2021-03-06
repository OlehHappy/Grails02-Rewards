package rewards

class CustomerController {
    // static scaffold = Customer

    def lookup() {
        def customerInstance = Customer.findAllByFirstNameIlikeAndTotalPointsGreaterThanEquals("B%", 3)
        [customerInstanceList: customerInstance]
    }

    def index() {
      params.max = 10
      [customerInstanceList: Customer.list(params), customerInstanceCount: Customer.count()]
    }

    def checkin() { }

    def create() {
      [customerInstance: new Customer()]
    }

    def save(Customer customerInstance) {
      customerInstance.save()
      redirect(action: "show", id: customerInstance.id)
    }

    def show(Long id) {
      def customerInstance = Customer.get(id)
      [customerInstance: customerInstance]
    }

    def edit(Long id) {
      def customerInstance = Customer.get(id)
      [customerInstance: customerInstance]
    }
}
