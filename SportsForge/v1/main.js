import React from 'react';
import './App.css';
import {Link} from 'react-router-dom'

function Main() {
    React.state = {
        login: "false",
        username:"none",
        password:"none"
    }
    
    React.handleUsernameChange = event => {
        this.setState({
            username: event.target.value
          })
    }

    React.handlePasswordChange = event => {
        this.setState({
            passowrd: event.target.value
          })
    }
    
    return (
        <div>
            <p>
                <input type="text" placeholder="Enter username" onChange={event => this.handleUsernameChange(event)}></input>
            </p>
            <p>
                <input type="text" placeholder="Enter password" onChange={event => this.handlePasswordChange(event)}></input>
            </p>
            <p>
                <Link to={"/home"}>
                    <button>Login</button>    
                </Link>
            </p>
            <p>
                <Link to={"/create"}>
                    <button>Create Account</button>
                </Link>    
            </p>
        </div>
    );
}

export default Main;