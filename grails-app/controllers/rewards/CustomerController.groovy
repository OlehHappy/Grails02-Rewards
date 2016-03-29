package rewards

class CustomerController {
    // static scaffold = Customer

    def lookup() {

        [customerInstanceList: customerInstance]
    }

    def index() {
      // params.max = 10
      def customerInstance = Customer.list()
      [customerInstanceList: Customer.list()]
    }

    def checkin() { }
}
