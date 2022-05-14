import React from 'react';
import './App.css';

function LeaguesSub({setTourn}) {
  return (
    <div style={{
        display: "flex",
        justifyContent: "center"
        }}>
            <div style={
                {width: 120, background: "red"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5 onClick={() => setTourn("NFL")}>NFL</h5>
                    </div>
            </div>
            <div style={
                {width: 120, background: "red"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5 onClick={() => setTourn("NBA")}>NBA</h5>
                    </div>
            </div>
            <div style={
                {width: 120, background: "red"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5 onClick={() => setTourn("MLB")}>MLB</h5>
                    </div>
            </div>
            <div style={
                {width: 120, background: "red"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5 onClick={() => setTourn("NHL")}>NHL</h5>
                    </div>
            </div>
            <div style={
                {width: 120, background: "red"}}>
                    <div style={{display:"inline", color: "white"}}>    
                       <h5 onClick={() => setTourn("MLS")}>MLS</h5>
                    </div>
            </div>
    </div>
  );
}

export default LeaguesSub;