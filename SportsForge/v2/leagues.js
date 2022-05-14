import React, {useState} from 'react';
import './App.css';

import NavBar from './navbar';
import LeaguesSub from "./leaguesSub"
import NFL from "./nfl"
import NBA from "./nba"
import TOURNAMENTS from "./tournaments"

function Leagues() {
  const[tourn,setTourney] = useState ("none");

  return (
    <div>
        <NavBar />
        <LeaguesSub setTourn={setTourney}/>
        {tourn === "NFL" && <TOURNAMENTS tourn={tourn}/>}
        {tourn === "NBA" && <NBA />}
    </div>
  );
}

export default Leagues;