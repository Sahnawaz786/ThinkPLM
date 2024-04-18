import React from 'react';
import { useLocation } from 'react-router-dom';
import styles from '../style.module.css';
import Contract from './Contract';
import PartTable from './PartTable';
import OnBoard from './OnBoard';
import PartManagementPage from './Pages/PartManagementPage';
import SupplierPage from './Pages/SupplierPage';
import Details from './Details';

const RightBar = () => {
  let location = useLocation();

  console.log(location.pathname);

  let componentToRender = <PartTable/> ;

  switch (location.pathname) {
    case '/part-table':
      componentToRender = <PartTable />;
      break;
    case '/onboard-status':
      componentToRender = <OnBoard />;
      break;
    case '/contract-details':
      componentToRender = <Contract />;
      break;
    case '/create-supplier':
      componentToRender = <SupplierPage/>;
      break;
    case '/create-part':
        componentToRender = <PartManagementPage/>;
        break;
        case '/details/:id':
          componentToRender = <Details/>;
          break;
  }

  return (
    <div className={styles.rightbarConatiner}>
      {componentToRender}
    </div>
  );
};

export default RightBar;
