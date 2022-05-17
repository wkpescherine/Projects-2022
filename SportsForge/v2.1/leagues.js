import React, {useState} from 'react';
import './App.css';

import LeaguesSub from "./leaguesSub"
import TOURNAMENTS from "./tournaments"

function Leagues() {
  const[tourn,setTourney] = useState ("none");

  return (
    <div>
        <LeaguesSub setTourn={setTourney}/>
        {tourn !== "none" && <TOURNAMENTS tourn={tourn}/>}
    </div>
  );
}

export default Leagues;