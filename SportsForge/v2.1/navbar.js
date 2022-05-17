import './App.css';

import {Link} from 'react-router-dom'

function NavBar({setSection}) {
  return (
    <div style={{
        display: "flex",
        justifyContent: "center"
        }}>
            <div style={
                {width: 100, background: "green"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5 onClick={() => setSection("Home")}>Home</h5>
                    </div>
            </div>
            <div style={
                {width: 100, background: "green"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5 onClick={() => setSection("Leagues")}>Leagues</h5>
                    </div>
            </div>
            <div style={
                {width: 100, background: "green"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5 onClick={() => setSection("Games")}>Current Games</h5>
                    </div>
            </div>
            <div style={
                {width: 100, background: "green"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5 onClick={() => setSection("Profile")}>Profile</h5>
                    </div>
            </div>
            <div style={
                {width: 100, background: "green"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5 onClick={() => setSection("Bank")}>Bank</h5>
                    </div>
            </div>
            <div style={
                {width: 100, background: "green"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <Link to={"/"}>
                           <h5>Logout</h5>
                        </Link>
                    </div>
            </div>
    </div>
  );
}

export default NavBar;