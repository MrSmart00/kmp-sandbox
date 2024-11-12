import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()
	@State var articles: [Article] = []

	var body: some View {
        VStack {
            ForEach(articles, id: \.self) { article in
                VStack(alignment: .leading) {
                    Text(article.title)
                    HStack {
                        Spacer()
                        Text(article.date)
                    }
                }
            }
	    }
	    .task {
	        do {
                articles = try await StubFeedReader().feeds()
	        } catch {
	            print("Failed feed loading")
	        }
	    }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
