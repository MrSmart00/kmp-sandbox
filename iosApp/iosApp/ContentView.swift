import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()
	@State var text = ""

	var body: some View {
	    VStack {
            Text(greet)
            Text(text)
	    }
	    .task {
	        do {
	            text = try await StubFeedReader().feeds()
	        } catch {
	            text = "Failed feed loading"
	        }
	    }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
