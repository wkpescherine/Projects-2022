import './App.css'
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'

import Main from "./main"
import Create from "./createaccount"
import Dashboard from "./dashboard"

function App() {
  return (
    <Router>
      <div className="App">
        <h2>The</h2>
        <h1>SportsForge</h1>
          <Routes>
            <Route exact path="/" element={ <Main />} />
            <Route exact path="/dashboard" element={ <Dashboard />} />
            <Route exact path="/create" element={<Create />}/>
          </Routes>
      </div>
    </Router>
  );
}

export default App;
