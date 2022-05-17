import './App.css';
import React, {useState} from 'react';

import NavBar from "./navbar"
import Home from "./home"
import Leagues from "./leagues"
import Profile from "./profile"
import Games from "./games"
import Bank from "./bank"

export default function Dashboard() {
    const[section,setSection] = useState ("Home");

    return(
        <div>
            <NavBar setSection={setSection}/>
            {section === "Home" && <Home />}
            {section === "Leagues" && <Leagues />}
            {section === "Profile" && <Profile />}
            {section === "Games" && <Games />}
            {section === "Bank" && <Bank />}
        </div>
    )
}