import React from 'react';
import './App.css';
import {Link} from 'react-router-dom'


function CreateAccount() {
    React.state = {
        username:"none",
        password:"none",
        email:"none"
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

    React.handleEmailChange = event => {
        this.setState({
            email: event.target.value
        })
    }

    
    return (
        <div>
            <p> 
                Username -  
                <input type="text" placeholder="Enter username" onChange={event => this.handleUsernameChange(event)}></input>
            </p>
            <p>
                Password -
                <input type="text" placeholder="Enter password" onChange={event => this.handlePasswordChange(event)}></input>
            </p>
            <p>
                Email -
                <input type="text" placeholder="Enter password" onChange={event => this.handleEmailChange(event)}></input>
            </p>
            <p>
                <Link to={"/home"}>
                    <button onClick={()=>this.handleLogIn}>Create</button>    
                </Link>
            </p>
            <p>
                <Link to={"/"}>
                    <button>Back</button>
                </Link>    
            </p>
        </div>
    );
}

export default CreateAccount;