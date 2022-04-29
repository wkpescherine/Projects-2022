import './App.css';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'

import Main from "./main"
import Home from "./home"
import Create from "./createaccount"

function App() {
  return (
    <Router>
      <div className="App">
        <h2>The</h2>
        <h1>SportsForge</h1>
          <Routes>
            <Route exact path="/" element={ <Main />} />
            <Route exact path="/home" element={<Home />}/>
            <Route exact path="/create" element={<Create />}/>
          </Routes>
      </div>
    </Router>
  );
}

export default App;
