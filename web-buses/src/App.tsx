import "./App.css";

import Header from "./components/Header.tsx";
import Functionbtn from "./components/Functionbtn.tsx";
import ContentTotal from "./components/ContentTotal.tsx";

function App() {
  return (
    <>
      <div className="app">
        <Header />
        <Functionbtn />
        <ContentTotal></ContentTotal>
      </div>
    </>
  );
}

export default App;
