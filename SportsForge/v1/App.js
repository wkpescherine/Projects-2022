import './App.css';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'

import Main from "./main"
import Create from "./createaccount"
import Home from "./home"
import Leagues from "./leagues"
import Games from "./games"
import Profile from "./profile"

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
            <Route exact path="/leagues" element={<Leagues />}/>
            <Route exact path="/games" element={<Games />}/>
            <Route exact path="/profile" element={<Profile />}/>
          </Routes>
      </div>
    </Router>
  );
}

export default App;
